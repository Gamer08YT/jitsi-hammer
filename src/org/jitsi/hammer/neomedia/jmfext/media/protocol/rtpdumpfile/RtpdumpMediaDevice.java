/*
 * Jitsi-Hammer, A traffic generator for Jitsi Videobridge.
 * 
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
 
package org.jitsi.hammer.neomedia.jmfext.media.protocol.rtpdumpfile;


import javax.media.*;
import javax.media.format.*;

import org.jitsi.impl.neomedia.device.*;
import org.jitsi.service.neomedia.*;


/**
 * Implements a <tt>MediaDevice</tt> that represent a CaptureDevice that
 * read a rtpdump file to provide recorded rtp packet.
 *
 * @author Thomas Kuntz
 */
public class RtpdumpMediaDevice
    extends MediaDeviceImpl
{
    /**
     * Initializes a new <tt>RtpdumpMediaDevice</tt> instance which will read
     * the rtpdump file located at <tt>filename</tt>, and which will have the
     * type <tt>payloadTypeConstant</tt>.
     * 
     * @param filename filename the location of the IVF the <tt>RtpdumpStream<tt>.
     * @param formatConstant the format this <tt>MediaDevice</tt> will have.
     * You can find the list of possible format in the class <tt>Constants</tt>
     * of libjitsi.
     */
    public RtpdumpMediaDevice(String filePath, String formatConstant)
    {
        super(new CaptureDeviceInfo(
                    filePath,
                    new MediaLocator("rtpdumpfile:" + filePath),
                    new Format[] { new VideoFormat(formatConstant) } ),
                MediaType.VIDEO);
    }
}