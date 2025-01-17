(ns clojure-kubernetes-client.specs.apiregistration-v1beta1-service-reference
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare apiregistration-v1beta1-service-reference-data apiregistration-v1beta1-service-reference)
(def apiregistration-v1beta1-service-reference-data
  {
   (ds/opt :name) string?
   (ds/opt :namespace) string?
   })

(def apiregistration-v1beta1-service-reference
  (ds/spec
    {:name ::apiregistration-v1beta1-service-reference
     :spec apiregistration-v1beta1-service-reference-data}))

