(ns clojure-kubernetes-client.specs.v1beta2-replica-set-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-label-selector :refer :all]
            [clojure-kubernetes-client.specs.v1-pod-template-spec :refer :all]
            )
  (:import (java.io File)))


(declare v1beta2-replica-set-spec-data v1beta2-replica-set-spec)
(def v1beta2-replica-set-spec-data
  {
   (ds/opt :minReadySeconds) int?
   (ds/opt :replicas) int?
   (ds/req :selector) v1-label-selector
   (ds/opt :template) v1-pod-template-spec
   })

(def v1beta2-replica-set-spec
  (ds/spec
    {:name ::v1beta2-replica-set-spec
     :spec v1beta2-replica-set-spec-data}))

