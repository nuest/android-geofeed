/**
 * Copyright 2012 52�North Initiative for Geospatial Open Source Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.geofeed.geo;

import org.n52.geofeed.core.IFeed;
import org.n52.geofeed.geo.core.IBox;
import org.n52.geofeed.geo.core.ICircle;
import org.n52.geofeed.geo.core.ILineString;
import org.n52.geofeed.geo.core.IPoint;
import org.n52.geofeed.geo.core.IPolygon;


/**
 * 
 * @author Arne de Wall <a.dewall@52North.org>
 *
 */
public interface IGeoFeed extends IFeed{
    String POINT = "point";
    String LINE = "line";
    String POLYGON = "polygon";
    String BOX = "box";
    String CIRCLE = "circle";
    String FEATURE_NAME = "featureName";
    String FEATURE_TYPE_TAG = "featureTypeTag";
    String RELATIONSHIP_TAG = "relationshipTag";
    String ELEVATION = "elev";
    String RADIUS = "radius";
    
    public IBox getBox();
    public ICircle getCircle();
    public ILineString getLine();
    public IPoint getPoint();
    public IPolygon getPolygon();
    
    public String getFeatureType();
    public String getRelationshipTag();
    public String getFeatureName();
    
    public double getElevation();
    public double getRadius();
    public double getFloor();
}
