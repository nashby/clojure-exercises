(ns clojure-exercises.lists-test
  (:use clojure.test
        clojure-exercises.lists))

(deftest shift-pop-test
  (testing "Returns a new list without first and last items"
    (is (= (shift-pop '(1 2 3 4 5)) '(2 3 4)))))

(deftest replace-negs-test
  (testing "Returns a new list without negative items"
    (is (= (replace-negs '(1 -2 3 -4 5)) '(1 0 3 0 5)))))

(deftest remove-zeros-test
  (testing "Returns a new list without zero values"
    (is (= (remove-zeros '(0 1 0 2 0 3 0 4 0 5)) '(1 2 3 4 5)))))

(deftest dup-item-test
  (testing "Returns a new list with duplicated item"
    (is (= (dup-item '(1 2 3 4 5 1) 1) '(1 1 2 3 4 5 1 1)))))

(deftest item-count-test
  (testing "Returns count of items in given list"
    (is (= (item-count '(0 1 2 3 4 1 2 1 3) 1) 3))))

(deftest reverse-list-test
  (testing "Returns reversed list"
    (is (= (reverse-list '(0 1 2 3 4 5)) '(5 4 3 2 1 0)))))
