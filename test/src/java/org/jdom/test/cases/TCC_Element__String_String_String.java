/*-- 

 Copyright (C) 2000 Brett McLaughlin & Jason Hunter.
 All rights reserved.
 
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions, and the following disclaimer.
 
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions, and the disclaimer that follows 
    these conditions in the documentation and/or other materials 
    provided with the distribution.

 3. The name "JDOM" must not be used to endorse or promote products
    derived from this software without prior written permission.  For
    written permission, please contact license@jdom.org.
 
 4. Products derived from this software may not be called "JDOM", nor
    may "JDOM" appear in their name, without prior written permission
    from the JDOM Project Management (pm@jdom.org).
 
 In addition, we request (but do not require) that you include in the 
 end-user documentation provided with the redistribution and/or in the 
 software itself an acknowledgement equivalent to the following:
     "This product includes software developed by the
      JDOM Project (http://www.jdom.org/)."
 Alternatively, the acknowledgment may be graphical using the logos 
 available at http://www.jdom.org/images/logos.

 THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED.  IN NO EVENT SHALL THE JDOM AUTHORS OR THE PROJECT
 CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 SUCH DAMAGE.

 This software consists of voluntary contributions made by many 
 individuals on behalf of the JDOM Project and was originally 
 created by Brett McLaughlin <brett@jdom.org> and 
 Jason Hunter <jhunter@jdom.org>.  For more information on the 
 JDOM Project, please see <http://www.jdom.org/>.
 
 */

package org.jdom.test.cases;

import org.jdom.Element;
import org.jdom.Namespace;

import junit.framework.TestCase;

/**
 * 
 * 
 * @author Jools Enticknap
 * @version 0.1
 */
public final class TCC_Element__String_String_String extends TestCase {
    /**
     *  Construct a new instance. 
     */
    public TCC_Element__String_String_String(String s) {
        super(s);
    }

    /**
     * Test code goes here. Replace this comment.
     */
    public void test() {
		String prefix = "test-prefix";
		String uri    = "test-uri";
		String name = "test-element";
		Element e = new Element(name, prefix, uri);

		// Check that the name supplied in the argument to the constructor
		// is the same as the one returned from getName().
		if (!e.getName().equals(name)) {
			StringBuffer sb = new StringBuffer("The Element was constructed ")
			                  .append("using the the name(")
							  .append(name)
							  .append(") but the following value was ")
							  .append("returned from getName() (")
							  .append(e.getName())
							  .append(")");
	
        	fail(sb.toString());
		}

		// Make sure that the URI matches the one supplied in the constructor.
		if (!e.getNamespaceURI().equals(uri)) {
			StringBuffer sb = new StringBuffer("The Element was constructed ")
			                  .append("using the URI(")
							  .append(uri)
							  .append(") but the following value was returned (")
							  .append(e.getNamespaceURI())
							  .append(")");

        	fail(sb.toString());
		}
		
		// Make sure that the prefix matches the one supplied in the constructor.
		if (!e.getNamespacePrefix().equals(prefix)) {
			StringBuffer sb = new StringBuffer("The Element was constructed ")
			                  .append("using the prefix(")
							  .append(prefix)
							  .append(") but the following value was returned (")
							  .append(e.getNamespacePrefix())
							  .append(")");

        	fail(sb.toString());
		}
    }

}
