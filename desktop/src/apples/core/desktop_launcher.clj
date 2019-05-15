(ns apples.core.desktop-launcher
  (:require [apples.core :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main
  []
  (LwjglApplication. apples-game "apples" 640 480)
  (Keyboard/enableRepeatEvents true))
