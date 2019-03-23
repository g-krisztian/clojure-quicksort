(ns qsort.core)

(defn qsort [lst]
  (if (not(empty? lst))
  (concat (qsort (filter #(< % (first lst)) (rest lst))) [(first lst)] (qsort (remove #(< % (first lst)) (rest lst))))))


(defn -main [& args]
(qsort [1 5 2 2 3 4]))
