/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.brp.service.selectie.verwerker;

import java.util.Collection;
import java.util.List;
import nl.bzk.brp.domain.berichtmodel.VerwerkPersoonBericht;
import nl.bzk.brp.domain.leveringmodel.persoon.Persoonslijst;

/**
 * SelectieBerichtFactory.
 */
interface SelectieResultaatBerichtFactory {
    /**
     * @param autorisatiebundels autorisatiebundels
     * @param persoonslijst persoonslijst
     * @return persoon berichten
     */
    List<VerwerkPersoonBericht> maakBerichten(Collection<SelectieAutorisatiebundel> autorisatiebundels, Persoonslijst persoonslijst);

}
