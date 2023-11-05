# Security Question
---
# A01 - BROKEN ACCESS CONTROL

- Take into account the hierarchy design of the roles, so that the authorization permisions are well designed, in this way the ownership of the information is guaranteed and the user hierarchy is correctly.
- Have tokens securely.
- Have access control architecture.
- Monitoring.
- Do not expose information in URL.


# A02 - CRYPTOGRAPHIC FAILURES

- Use recommended encryption techniques such as Argon2, Script, BCrypt, PBKDF2.
- Identify sensitive information and sotre it with encryption, lest there be security breaches and the data is exposed or that an employee commits the crime of selling information.
- Use secure means for credit cards, if payments are made through the app, have a certified providerthat provides a scheme and set of libraries, this involves a process that is secure, in addition these companies are certified on certain guidelines that allow you to sotre credit cards.
- Know the level of sensitivity of the information, depending on the type of classification it has, implement a strict or more flexible way.
- Have real information assurance requirements in transit and at rest.
- Comply with data protection standards, regulations or regulations if applicable.
- Implement session-level encryption control.
- Correctly configure Cookie secure, HTTP Strict.
- Correct management of cryptographic keys, rotation, generation, storage.
- Design with PRIVACY in mind.


# A03 - INJECTION 

- Have the semantic elements of HTML5 well configured, that their field collection is validated so that it does not allow Cross-Site Scripting with HTML injections, both reflected and persistent, each variable must be protected and have validation, then it is eliminated or cleaned, this is known as injection resistance, defining string length, defining what characters I need and not giving that freedom to the user.

# A04 - INSECURE DESIGN

- Be careful in the creation process but also in software maintenance.
- Train engineers in security matters and better manage project planning so that they take security issues into account from the beginning, in this way time and budget are better managed by not having future errors that could have a cost. Higher and problems with delivery dates.
- Raising awareness among the engineering team about how they perceive the responsibility of the secure development cycle, in this way the mindset of the work team is changed.
- Know OWASP - SAMM so that the team knows what to implement according to their needs.

# A05 - SECURITY MISCONFIGURATION

- Verify that access permissions are appropriate.
- Make appropriate use of errors/exceptions.
- Enable security features of the frameworks and do not think about their configuration solely in terms of functionality.
- Limit trusted IPs.
- Default password settings must have a sense of security that is adequate, without this we proceed in the absence of best security practices (hardening).
- Avoid local, remote or service attacks due to abusive use of XML parsers.

# A06 - VULNERABLE AND OUTDATED COMPONENTS

- Vulnerabilities always exist, there is no perfect software, patches exist for a reason; outdated components are vulnerable and if they are not supported, then you must migrate to versions that do have support, yo must update these components!

# A07 - IDENTIFICATION AND AUTHENTICATION FAILURES

- Login should be limited, this way we limit attackers use.
- Do not use security questions because they reduce the number of answers and through them create opportunities for attackers.
- Do not save passwords in plain text.
- Set MFA Login.
- Do not leave sensitive data in production.
- Force the user to enter complex passwords.
- The autenticacion mechanism is weak because it does not adequately protect against brute force attacks; additionally, there are flaws in logic or poor coding in the implementation that allow the autentication mechanism to be bypassed.
- Do not keep a user logged in.
- Prevent cookies from being compromised so that the session value is not compromised.
- Implement a server side session controller.

# A08 - SOFTWARE AND DATA INTEGRITY FAILURES

- Use components, dependencies,etc. From reliable sources.
- Make deserialization safe, since an attacker can deserialize and inject new values (bad-stuff).
- Have data integrity checks.
- Implement robust access control (CI/CD pipeline).

# A09 - SECURITY LOGGING AND MONITORING FAILURES

- have traceability of important system processes, use reliable tools.

# A10 - SERVER SIDE REQUEST FORGERY (SSRF)

- Make segmentation at the network layer so that it cannot access other resources.
- Default deny at firewall policy level.
- Have a white list of accesses that must be enabled.
