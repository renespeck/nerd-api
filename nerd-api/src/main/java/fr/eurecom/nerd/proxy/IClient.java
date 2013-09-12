//   NERD - The Named Entity Recognition and Disambiguation framework.
//          It processes textual resources for extracting named entities
//          linked to Web resources.
//
//   Copyright 2011 Politecnico di Torino
//             2011 EURECOM
//             2013 Universita' di Torino
//
//   Authors:
//      Giuseppe Rizzo <giuse.rizzo@gmail.com>
//
//   Licensed under both the CeCILL-B and the Apache License, Version 2.0 
//   (the "License"); you may not use this file except in compliance with 
//   the License. You may obtain a copy of the License at
//     http://www.cecill.info/licences/Licence_CeCILL-B_V1-en.html
//     http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package fr.eurecom.nerd.proxy;

import java.util.List;

import fr.eurecom.nerd.db.table.TDocument;
import fr.eurecom.nerd.db.table.TEntity;
import fr.eurecom.nerd.exceptions.ClientException;
import fr.eurecom.nerd.ontology.OntologyType;

public interface IClient {
    
    public List<TEntity> extract (
                                         TDocument document, 
                                         String key,
                                         OntologyType otype
                                     ) 
    throws ClientException;
}
