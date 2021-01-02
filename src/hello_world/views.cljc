(ns hello-world.views
  (:require [re-frame.core :as rf]))

(defn hello-world []
  (let [text @(rf/subscribe [:text])]
    [:div
     [:h1 text]
     [:h3 "Some update."]]))
