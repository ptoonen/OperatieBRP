/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.brp.beheer.webapp.configuratie.json.stamgegevens.autaut;

import com.fasterxml.jackson.annotation.JsonProperty;

import nl.bzk.brp.beheer.webapp.configuratie.json.stamgegevens.AbstractIdCodeNaamOmschrijvingEnumMixIn;

/**
 * Basis enum mixin.
 */
public abstract class AbstractProtocolleringsniveauMixIn extends AbstractIdCodeNaamOmschrijvingEnumMixIn {

    /** @return datum aanvang geldigheid */
    @JsonProperty("datumAanvangGeldigheid")
    abstract Integer getDatumAanvangGeldigheid();

    /** @return datum einde geldigheid */
    @JsonProperty("datumEindeGeldigheid")
    abstract Integer getDatumEindeGeldigheid();
}
