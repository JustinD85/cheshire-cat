(ns chesire-cat.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [cheshire.core :as json]))

(defroutes app-routes
  (GET "/" [] "<h1>Welcome</h1>")
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
