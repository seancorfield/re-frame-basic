;; This test runner is intended to be run from the command line
(ns hello-world.test-runner
  (:require
    ;; require all the namespaces that you want to test
    [hello-world.views-test]
    [figwheel.main.testing :refer [run-tests-async]]))

(defn -main [& _]
  (run-tests-async 5000))
