/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.core.impl.partitionedsearch.scope;

import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.impl.phase.scope.AbstractStepScope;

/**
 * @param <Solution_> the solution type, the class with the {@link PlanningSolution} annotation
 */
public class PartitionedSearchStepScope<Solution_> extends AbstractStepScope<Solution_> {

    private final PartitionedSearchPhaseScope<Solution_> phaseScope;

    private PartitionChangeMove step = null;
    private String stepString = null;

    public PartitionedSearchStepScope(PartitionedSearchPhaseScope<Solution_> phaseScope) {
        this(phaseScope, phaseScope.getNextStepIndex());
    }

    public PartitionedSearchStepScope(PartitionedSearchPhaseScope<Solution_> phaseScope, int stepIndex) {
        super(stepIndex);
        this.phaseScope = phaseScope;
    }

    @Override
    public PartitionedSearchPhaseScope<Solution_> getPhaseScope() {
        return phaseScope;
    }

    public PartitionChangeMove getStep() {
        return step;
    }

    public void setStep(PartitionChangeMove step) {
        this.step = step;
    }

    /**
     * @return null if logging level is to high
     */
    public String getStepString() {
        return stepString;
    }

    public void setStepString(String stepString) {
        this.stepString = stepString;
    }

    // ************************************************************************
    // Calculated methods
    // ************************************************************************

}
