/**
 * This file is part of the JCHAI 3D visualization and haptics libraries.
 * Copyright (C) 2010 by JCHAI 3D. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License("GPL") version 2 as published by
 * the Free Software Foundation.
 *
 * For using the JCHAI 3D libraries with software that can not be combined with
 * the GNU GPL, and for taking advantage of the additional benefits of our
 * support services, please contact CHAI 3D about acquiring a Professional
 * Edition License.
 *
 * project <https://sourceforge.net/projects/jchai3d>
 */
package org.jchai3d.collisions.spheres;

import java.util.TreeMap;

/**
 * 
 * This class is a adaptation to the PtMap type definition in CHAI3D.
 *
 * @author Marcos da Silva Ramos
 */
public class JPointMap {
    
    TreeMap<JCollisionSpheresPoint, JCollisionSpheresEdge> map;

    public JPointMap() {
        map = new TreeMap<JCollisionSpheresPoint, JCollisionSpheresEdge>();
    }
    
    public void add(JCollisionSpheresPoint point, JCollisionSpheresEdge edge) {
        map.put(point, edge);
    }
}
