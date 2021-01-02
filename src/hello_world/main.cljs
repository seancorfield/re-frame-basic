(ns ^:figwheel-hooks hello-world.main
  (:require [hello-world.core]
            [hello-world.views :as views]
            [re-frame.core :as rf]
            [reagent.dom :as rdom]))

(println "Reloading hello-world.main.")

(defn ^:after-load run []
  (when-let [el (js/document.getElementById "app")]
    (rdom/render [views/hello-world] el)))

(defn ^:export main
  []
  (rf/dispatch-sync [:initialize])
  (run))