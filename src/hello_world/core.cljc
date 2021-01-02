(ns hello-world.core
  (:require [hello-world.events]
            [hello-world.subs]
            [re-frame.core :as rf]))

(defn hello-world []
  (let [text @(rf/subscribe [:text])]
    [:div
     [:h1 text]
     [:h3 "Some update."]]))

(comment
  #?(:clj
      (load-file (str (System/getProperty "user.home")
                      "/.clojure/dev.clj")))
  @(rf/subscribe [:text])
  (rf/dispatch [:update-text {:text "via REPL"}])
  ,)
