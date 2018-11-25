/*******************************************************************************
 * Copyright (c) 2011 Igor Fedorenko
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      Igor Fedorenko - initial API and implementation
 *******************************************************************************/

package com.ifedorenko.p2browser.model.match;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.equinox.p2.metadata.IInstallableUnit;

public class InstallableUnitsMatcher implements IInstallableUnitMatcher {
    private final Set<IInstallableUnit> units;

    public InstallableUnitsMatcher(Collection<IInstallableUnit> units) {
        this.units = new HashSet<>(units);
    }

    @Override
    public boolean match(IInstallableUnit unit) {
        return units.contains(unit);
    }

}
