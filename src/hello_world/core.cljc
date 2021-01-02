(ns hello-world.core
  (:require [hello-world.events]
            [hello-world.subs]
            [hello-world.views]))

(comment
  (require '[re-frame.core :as rf])
  (rf/dispatch-sync [:initialize])
  @(rf/subscribe [:text])
  (rf/dispatch [:update-text {:text "via REPL"}])
  ,)
