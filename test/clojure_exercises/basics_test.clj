(ns clojure-exercises.basics-test
  (:use clojure.test
        clojure-exercises.basics))

(deftest shift-pop-test
  (testing "Returns a new list without first and last items"
    (is (= (shift-pop '(1 2 3 4 5)) '(2 3 4)))))

(deftest replace-negs-test
  (testing "Returns a new list without negative items"
    (is (= (replace-negs '(1 -2 3 -4 5)) '(1 0 3 0 5)))))
