(ns armstrong-numbers)

(defn digits[n] (count (map #(Character/digit % 10) (str n))))
(defn elevNum 
  [base exp] 
  (apply * (repeat exp base)))

(defn splitNum [n] (map #(Character/digit % 10) (str n)))

(defn armstrong? [num] ;; <- arglist goes here
  ;; your code goes here  
  (def nDigits (digits num))
  (println nDigits)
  (println num)
  (println (elevNum num nDigits))
  
)

(armstrong? 10)
