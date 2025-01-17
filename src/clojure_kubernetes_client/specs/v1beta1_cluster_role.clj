(ns clojure-kubernetes-client.specs.v1beta1-cluster-role
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1beta1-aggregation-rule :refer :all]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1beta1-policy-rule :refer :all]
            )
  (:import (java.io File)))


(declare v1beta1-cluster-role-data v1beta1-cluster-role)
(def v1beta1-cluster-role-data
  {
   (ds/opt :aggregationRule) v1beta1-aggregation-rule
   (ds/opt :apiVersion) string?
   (ds/opt :kind) string?
   (ds/opt :metadata) v1-object-meta
   (ds/opt :rules) (s/coll-of v1beta1-policy-rule)
   })

(def v1beta1-cluster-role
  (ds/spec
    {:name ::v1beta1-cluster-role
     :spec v1beta1-cluster-role-data}))

