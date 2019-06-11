# cheshire-cat
[![Built with Spacemacs](https://cdn.rawgit.com/syl20bnr/spacemacs/442d025779da2f62fc86c2082703697714db6514/assets/spacemacs-badge.svg)](http://spacemacs.org)

Shows a working fullstack app written in (mostly) clojure/clojurescript

Deps: 
- [cljs-http](https://github.com/r0man/cljs-http)
- [compojure](https://github.com/weavejester/compojure)
- [ring](https://github.com/ring-clojure/ring)
- [clojurescript](https://clojurescript.org/)
- [core.async](https://github.com/clojure/core.async)
- [dommy](https://github.com/plumatic/dommy)
___

# Setup:

#### Leiningen and Clojure require Java. OpenJDK version 8 is recommended at this time.

- Download the lein script (or on Windows lein.bat)
- Place it on your $PATH where your shell can find it (eg. ~/bin)
- Set it to be executable (chmod a+x ~/bin/lein)
- Run it (lein) and it will download the self-install package

# Run it

- start server with `lein ring server`
- visit `localhost:3000/cat.html`
- click around :fire:
