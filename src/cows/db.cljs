(ns cows.db
  (:require
    [cows.lib :as lib :refer [capture-env]]
    [cows.macros :refer [defcursors defderivations]]))

(defonce db (atom {}))

(defcursors db
  uid [:ui :uid]
  email [:ui :email]
  games [:games]
  all-messages [:messages])

(defderivations
  [::current-game games uid] (->> games
                               vals
                               (filter (fn [{:keys [players]}]
                                         (some #{uid} players)))
                               first)
  [::game-id current-game] (-> current-game :ident second)
  [::messages all-messages game-id] (when game-id
                                      (->> all-messages
                                        vals
                                        (filter (fn [{[_ [_ message-game-id]] :ident}]
                                                  (= game-id message-game-id)))
                                        (sort-by :timestamp)))
  [::subscriptions game-id] (if game-id
                              #{[:games game-id]
                                [:messages [:games game-id]]}
                              #{[:games]}))

(def env (capture-env 'cows.db))