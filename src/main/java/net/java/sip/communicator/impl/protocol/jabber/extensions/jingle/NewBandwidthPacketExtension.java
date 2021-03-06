/*
 * Jitsi, the OpenSource Java VoIP and Instant Messaging client.
 *
 * Copyright @ 2017 Atlassian Pty Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.java.sip.communicator.impl.protocol.jabber.extensions.jingle;

/**
 * A representation of the <tt>bandwidth</tt> element used in RTP
 * <tt>description</tt> elements.
 *
 * @author Emil Ivov
 * @author Brian Baldino
 */
public class NewBandwidthPacketExtension
        extends NewAbstractExtensionElement
{
    /**
     * The name of the "bandwidth" element.
     */
    public static final String ELEMENT_NAME = "bandwidth";

    /**
     * The name of the type argument.
     */
    public static final String TYPE_ATTR_NAME = "type";

    /**
     * Creates a new {@link NewBandwidthPacketExtension} instance.
     */
    public NewBandwidthPacketExtension()
    {
        super(ELEMENT_NAME, null);
    }

    /**
     * Sets the value of the optional <tt>type</tt> argument in the
     * <tt>bandwidth</tt> element.
     *
     * @param type a <tt>String</tt> value which would often be one of the
     * <tt>bwtype</tt> values specified by SDP
     */
    public void setType(String type)
    {
        setAttribute(TYPE_ATTR_NAME, type);
    }

    /**
     * Returns the value of the optional <tt>type</tt> argument in the
     * <tt>bandwidth</tt> element.
     *
     * @return a <tt>String</tt> value which would often be one of the
     * <tt>bwtype</tt> values specified by SDP
     */
    public String getType()
    {
        return getAttributeAsString(TYPE_ATTR_NAME);
    }

    /**
     * Sets the value of this bandwidth extension.
     *
     * @param bw the value of this bandwidth extension.
     */
    public void setBandwidth(String bw)
    {
        super.setText(bw);
    }

    /**
     * Returns the value of this bandwidth extension.
     *
     * @return the value of this bandwidth extension.
     */
    public String getBandwidth()
    {
        return super.getText();
    }
}