(ns hello-world.events
  (:require [re-frame.core :as rf]))

(rf/reg-event-db :initialize  (fn [_  _] {:text "Initialized!"}))

(rf/reg-event-db :update-text
  [rf/debug (rf/path :text) rf/unwrap]
  (fn [_ {:keys [text]}]
    (rf/console :warn "new text" text)
    text))
