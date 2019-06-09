(ns cheshire-cat.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.middleware.json :as json]
            [ring.util.response :as rr]))

(defroutes app-routes
  (GET "/" [] "<h1>Welcome</h1>")
  (GET "/cheshire-cat" []
        (rr/response {:name "Chesire Cat"
                :status :grinning
                :folk :yessir}))
  (route/not-found "Not Found"))

(def app
  (-> app-routes
      (json/wrap-json-response)
      (wrap-defaults site-defaults)
      ))
