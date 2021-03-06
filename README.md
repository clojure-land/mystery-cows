# Mystery Cows

This is an example program (a cow-themed version of the board game Clue) meant
to demonstrate how to make a web app with ClojureScript and Firebase. It's
deployed at [cows.jacobobryant.com](https://cows.jacobobryant.com).

The following requires no knowledge of Clojure or Firebase. Once you have it
running, you can start poking around the code to see how it works. While
running `./task dev`, any Clojure(Script) files you change will be recompiled
automatically.

I've also recorded some commentary on the architecture of this project [here](https://www.youtube.com/watch?v=c6CylfdcsTo).

## Setup

1. At [firebase.google.com](https://firebase.google.com), create a new project.
2. In the "Authentication" section, click "Set up sign-in method." First enable
   "Email/Password," and then also enable "Email link (passwordless sign-in)."
   After that, enable sign-in with Google.
3. In the "Database" section, click on "Database" and then "Create database."
   Accept the defaults.
4. Install dependencies: [NPM](https://www.npmjs.com/get-npm),
   [Clojure](https://clojure.org/guides/getting_started) and
   [Overmind](https://github.com/DarthSim/overmind).
5. Clone this repository. Inside the project directory, run `./task setup`.
6. Run `firebase login` and then `firebase init`. Select your existing project,
   and then select Firestore, Hosting and Functions. Accept the defaults for
   everything.

## Development

1. Run `./task dev`.
2. After Shadow CLJS loads, go to [localhost:9630](http://localhost:9630).
   Hover over "Builds," then check the "main" and "fn" boxes.

The app is now available at [localhost:5000](http://localhost:5000).

## Deploy

Run `./task deploy`. The app will be available at
`https://your-project-id.web.app`.

## Contact

Search for `Jacob O'Bryant` on [Clojurians Slack](http://clojurians.net), or
get my email from [my website](https://jacobobryant.com).

## Self-promotion

If you want to support my work, subscribe to [my newsletter](https://findka.com/subscribe/).

## License

Distributed under the [EPL v2.0](LICENSE)

Copyright &copy; 2020 [Jacob O'Bryant](https://jacobobryant.com).
