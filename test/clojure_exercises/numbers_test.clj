(ns clojure-exercises.numbers-test
  (:use clojure.test
        clojure-exercises.numbers))

(deftest first-digit-test
  (testing "Returns the first digit of given number"
    (is (= (first-digit 345) 3))))
