/*
  Copyright (c) 2020, 2021, Oracle and/or its affiliates.

  This software is dual-licensed to you under the Universal Permissive License
  (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License
  2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose
  either license.

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

     https://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
*/
/**
 * Implements the R2DBC SPI for Oracle Database.
 *
 * @provides io.r2dbc.spi.ConnectionFactoryProvider
 * @since 0.1.0
 */
module com.oracle.database.r2dbc {

  provides io.r2dbc.spi.ConnectionFactoryProvider
    with oracle.r2dbc.impl.OracleConnectionFactoryProviderImpl;

  requires java.sql;
  requires com.oracle.database.jdbc;
  requires reactor.core2Desk;
  requires transitive org.reactivestreams;
  requires transitive r2dbc.spi;

  exports oracle.r2dbc;
}
