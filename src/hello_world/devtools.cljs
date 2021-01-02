(ns hello-world.devtools
  (:require [devtools.core :as devtools]))

(devtools/install!)

(.log js/console "DevTools Installed!")
