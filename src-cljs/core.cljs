(ns cheshire-cat.core
  (:require [clojure.browser.repl :as repl]
            [cljs-http.client :as http]
            [cljs.core.async :refer [<!]]
            [dommy.core :as dommy :refer-macros [sel sel1]])
  (:require-macros [cljs.core.async.macros :refer [go]]))

(defn click-handler [e]
  (.log js/console "You just clicked me!"))

(defn ^:export init []
  (repl/connect "http://localhost:9000/repl")
  (go
    (let [response (<! (http/get "/cheshire-cat")) cat-name (:name (:body response)) status (:status (:body response))]
      (-> (sel1 :#cat-name)
          (dommy/set-text! (str "Name: " cat-name)))
      (-> (sel1 :#status)
          (dommy/set-text! (str "Status: " status)))
      (dommy/listen! (sel1 :#status) :click click-handler))
