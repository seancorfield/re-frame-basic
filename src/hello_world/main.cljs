(ns ^:figwheel-hooks hello-world.main
  (:require [hello-world.core :as app]
            [re-frame.core :as rf]
            [reagent.dom :as rdom]))

(println "Reloading hello-world.main.")

(defn ^:after-load run []
  (when-let [el (js/document.getElementById "app")]
    (rdom/render [app/hello-world] el)))

(defn ^:export main
  []
  (rf/dispatch-sync [:initialize])
  (run))