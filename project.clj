(defproject cheshire-cat "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-json "0.4.0"]
                 [org.clojure/clojurescript "1.10.520"]
                 [cljs-http "0.1.46"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
								 [prismatic/dommy "1.1.0"]]
  :plugins [[lein-ring "0.12.5"]
            [lein-cljsbuild "1.1.7"]]
  :ring {:handler cheshire-cat.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}}
  :cljsbuild
  {:builds
   [{:compiler
     {:output-to "resources/public/js/main.js",
      :optimizations :whitespace,
      :pretty-print true},
     :source-paths ["src-cljs"]}]})
