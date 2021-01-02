(ns hello-world.views-test
    (:require
     #?(:clj  [clojure.test :refer [deftest is testing]]
        :cljs [cljs.test :refer-macros [deftest is testing]])
     [hello-world.core]
     [hello-world.views :as sut]
     [re-frame.core :as rf]))

(deftest hello-works-test
  (rf/dispatch-sync [:update-text {:text "TEST"}])
  (testing "hello-world return a div with headings"
    (let [result (sut/hello-world)]
      (is (vector? result))
      (is (= :div (first result)))
      (is (= [:h1 :h3] (map first (rest result))))
      (is (= "TEST" (second (fnext result)))))))
