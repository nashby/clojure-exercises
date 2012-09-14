(ns clojure-exercises.basics)

(defn shift-pop [items]
  (rest (butlast items)))

(defn replace-negs [items]
  (map (fn [n]
            (if (neg? n) 0 n))
        items))

(defn remove-zeros [items]
  (filter (fn [n] (not (zero? n))) items))

(defn dup-item [items, dup]
  (mapcat (fn [n] (if (= dup n) (repeat 2 n) (list n))) items))
