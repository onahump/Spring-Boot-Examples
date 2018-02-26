package com.makingdevs.demo.dao

import com.makingdevs.demo.model.Concept

interface ConceptDao {

    int insertNewConcept(UUID conceptId, Concept concept);

    Concept selectConceptById(UUID conceptId);

    List<Concept> selectAllConcept();

    int updateConceptById(UUID conceptId, Concept conceptUpdate);

    int deleteConceptById(UUID conceptId);

}