/**
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2007-2012 Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.codehaus.plexus.util.IOUtil;

public class DigesterUtils
    /**
     * Hex Encodes the digest value.
     * 
     * @param md
     * @return
     */
    public static String getDigestAsString( byte[] digest )
    {
        return new String( encodeHex( digest ) );
    }


    public static String getMd5Digest( byte[] byteArray )
    {
        return getMd5Digest( new ByteArrayInputStream( byteArray ) );
    }

    public static String getSha1Digest( byte[] byteArray )
    {
        return getSha1Digest( new ByteArrayInputStream( byteArray ) );
    }

