(ns clojure-exercises.basics)

(defn shift-pop [items]
  (rest (butlast items)))

(defn replace-negs [items]
  (map (fn [n]
            (if (neg? n) 0 n))
        items))
