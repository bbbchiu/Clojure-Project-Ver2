(ns apples.core
  (:require [play-clj.core :refer :all]
            [play-clj.g2d :refer :all]
            [play-clj.math :refer :all]))

(defscreen main-screen
  :on-show
  (fn [screen entities]
    (update! screen :renderer (stage))
    (add-timer! screen :spawn-apple 1 2)
    (let [background (texture "apple_orchard.png")
          player (assoc (texture "cow.png") :x 50, :y 50, :width 320, :height 240, :player? true, :direction :right)]
      [background player]))

  :on-render
  (fn [screen entities]
    (clear!)
    (render! screen entities)))

(defgame apples-game
  :on-create
  (fn [this]
    (set-screen! this main-screen)))
