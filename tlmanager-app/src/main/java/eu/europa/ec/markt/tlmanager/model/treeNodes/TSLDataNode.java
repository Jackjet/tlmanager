/**
 * TL Manager
 * Copyright (C) 2015 European Commission, provided under the CEF programme
 *
 * This file is part of the "TL Manager" project.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package eu.europa.ec.markt.tlmanager.model.treeNodes;

import java.util.List;

import javax.swing.Icon;
import javax.swing.tree.TreeNode;

/**
 * Interface for all extensions of <code>DefaultMutableTreeNode</code> that are responsible for the data of a TSL.
 * 
 *
 *
 */

public interface TSLDataNode {

    /**
     * Returns a list of objects with all children nodes.
     * 
     * @return list of children nodes
     */
    public List<Object> getChildren();

    /**
     * Returns this node's parent or null if this node has no parent.
     * 
     * @return this node's parent TreeNode, or null if this node has no parent
     */
    public TreeNode getParent();

    /**
     * Returns the name of the associated data publisher according to <code>TreeDataPublisher</code>
     * 
     * @return the name of the data publisher
     */
    public String getAssociatedDataPublisherName();

    /**
     * Serves as a hook for <code>DefaultMutableTreeNode.getUserObject()</code>.
     * 
     * @return the user object
     */
    public Object getUserObject();

    /**
     * Sorts all children.
     */
    public void sort();

    /**
     * Returns the icon for the node.
     * 
     * @return the icon
     */
    public Icon getIcon();

    /**
     * Returns the label for the node.
     * 
     * @return the label
     */
    public String getLabel();

    /**
     * Resets the label, which will cause the label to be created anew.
     */
    public void resetLabel();
}