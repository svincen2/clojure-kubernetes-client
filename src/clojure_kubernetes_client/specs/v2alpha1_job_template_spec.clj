(ns clojure-kubernetes-client.specs.v2alpha1-job-template-spec
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [clojure-kubernetes-client.specs.v1-object-meta :refer :all]
            [clojure-kubernetes-client.specs.v1-job-spec :refer :all]
            )
  (:import (java.io File)))


(declare v2alpha1-job-template-spec-data v2alpha1-job-template-spec)
(def v2alpha1-job-template-spec-data
  {
   (ds/opt :metadata) v1-object-meta
   (ds/opt :spec) v1-job-spec
   })

(def v2alpha1-job-template-spec
  (ds/spec
    {:name ::v2alpha1-job-template-spec
     :spec v2alpha1-job-template-spec-data}))
