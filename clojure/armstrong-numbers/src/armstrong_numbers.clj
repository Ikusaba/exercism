(ns armstrong-numbers)

(defn digits[n] (count (map #(Character/digit % 10) (str n))))
(defn elevNum 
  [base exp] 
  (apply * (repeat base exp)))

(defn splitNum [n] (map #(Character/digit % 10) (str n)))

(defn armstrong? [num] ;; <- arglist goes here
  ;; your code goes here  
  (def nDigits (digits num))
  (pr-str (map elevNum (splitNum num) nDigits))
  
)

(armstrong? 153)
