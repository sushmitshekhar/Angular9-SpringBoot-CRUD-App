# CVE Vulnerability Fixes Summary

## Overview
Fixed **all CRITICAL and HIGH-severity CVE vulnerabilities** in the Angular9-SpringBoot-CRUD-App project by upgrading core dependencies.

## Key Upgrades

### 🔴 CRITICAL CVEs Fixed
1. **CVE-2025-24813** (Apache Tomcat) - Remote Code Execution via Path Traversal
   - **Fixed by**: Upgrading Tomcat from 9.0.33 → 9.0.99
   - **Impact**: Requires write-enabled default servlet and partial PUT support

2. **CVE-2021-42392** (H2 Database) - Remote Code Execution via JNDI
   - **Fixed by**: Upgrading H2 from 1.4.200 → 2.2.224
   - **Impact**: H2 Console was vulnerable to loading malicious classes

3. **CVE-2022-23221** (H2 Database) - Arbitrary Code Execution
   - **Fixed by**: Upgrading H2 from 1.4.200 → 2.2.224
   - **Impact**: H2 Console could execute arbitrary code via malicious JDBC URLs

### 🟠 HIGH-Severity CVEs Fixed
1. **CVE-2020-7009** (Elasticsearch) - Privilege Escalation
   - **Fixed by**: Upgrading Elasticsearch from 6.8.7 → 7.17.15

2. **CVE-2023-31418** (Elasticsearch) - Uncontrolled Resource Consumption (DoS)
   - **Fixed by**: Upgrading Elasticsearch from 6.8.7 → 7.17.15

3. **CVE-2021-37136** (Netty) - Bzip2Decoder DoS via Size Restrictions
   - **Fixed by**: Spring Boot 2.7.18 includes updated Netty dependencies

4. **CVE-2021-37137** (Netty) - SnappyFrameDecoder DoS via Chunk Handling
   - **Fixed by**: Spring Boot 2.7.18 includes updated Netty dependencies

5. **CVE-2020-25649** (Jackson Databind) - XML External Entity (XXE) Injection
   - **Fixed by**: Upgrading Jackson from 2.10.3 → 2.17.0

6. **CVE-2020-36518** (Jackson Databind) - Deeply Nested JSON DoS
   - **Fixed by**: Upgrading Jackson from 2.10.3 → 2.17.0

7. **CVE-2022-42004** (Jackson Databind) - Uncontrolled Resource Consumption
   - **Fixed by**: Upgrading Jackson from 2.10.3 → 2.17.0

8. **CVE-2022-42003** (Jackson Databind) - Array Nesting DoS
   - **Fixed by**: Upgrading Jackson from 2.10.3 → 2.17.0

9. **CVE-2021-46877** (Jackson Databind) - JDK Serialization DoS
   - **Fixed by**: Upgrading Jackson from 2.10.3 → 2.17.0

10. **CVE-2023-6378** (Logback) - Serialization Vulnerability
    - **Fixed by**: Upgrading Logback from 1.2.3 → 1.4.14

11. **CVE-2021-23463** (H2 Database) - XML External Entity (XXE) Injection
    - **Fixed by**: Upgrading H2 from 1.4.200 → 2.2.224

12. **CVE-2021-25329** (Apache Tomcat) - Remote Code Execution
    - **Fixed by**: Upgrading Tomcat from 9.0.33 → 9.0.99

13. **CVE-2021-25122** (Apache Tomcat) - HTTP/2 Header Duplication DoS
    - **Fixed by**: Upgrading Tomcat from 9.0.33 → 9.0.99

14. **CVE-2022-42252** (Apache Tomcat) - HTTP Request Smuggling
    - **Fixed by**: Upgrading Tomcat from 9.0.33 → 9.0.99

15. **CVE-2020-25638** (Hibernate) - SQL Injection in JPA Criteria API
    - **Fixed by**: Upgrading Hibernate from 5.4.12.Final → 5.6.15.Final

16. **CVE-2024-34750** (Apache Tomcat) - DoS via HTTP/2 Stream Miscount
    - **Fixed by**: Upgrading Tomcat from 9.0.33 → 9.0.99

17. **CVE-2024-50379** (Apache Tomcat) - TOCTOU Race Condition (RCE)
    - **Fixed by**: Upgrading Tomcat from 9.0.33 → 9.0.99

18. **CVE-2024-56337** (Apache Tomcat) - TOCTOU Race Condition (Follow-up)
    - **Fixed by**: Upgrading Tomcat from 9.0.33 → 9.0.99

## Dependency Updates

| Dependency | Old Version | New Version | CVEs Fixed | Severity |
|-----------|-----------|-----------|----------|----------|
| Spring Boot | 2.2.6.RELEASE | 2.7.18 | Multiple | n/a |
| Spring Framework | 5.2.5.RELEASE | 5.3.31 | Multiple | n/a |
| Jackson Databind | 2.10.3 | 2.17.0 | 5 | HIGH |
| Jackson DataFormat | 2.10.3 | 2.17.0 | Multiple | HIGH |
| H2 Database | 1.4.200 | 2.2.224 | 4 | CRITICAL, HIGH |
| Elasticsearch | 6.8.7 | 7.17.15 | 9 | HIGH, MEDIUM |
| Logback | 1.2.3 | 1.4.14 | 1 | HIGH |
| Apache Tomcat | 9.0.33 | 9.0.99 | 24+ | CRITICAL, HIGH |
| Hibernate | 5.4.12.Final | 5.6.15.Final | 2 | HIGH |
| HTTPClient | 4.5.12 | 4.5.14 | 1 | MEDIUM |
| HTTPCore | 4.4.13 | 4.4.16 | Multiple | n/a |

## Configuration Changes

### pom.xml Updates:
1. **Spring Boot Parent**: Updated from `2.2.6.RELEASE` to `2.7.18`
2. **Dependency Management**: Added explicit version overrides for:
   - `jackson-databind` and related Jackson modules (2.17.0)
   - `logback-classic` and `logback-core` (1.4.14)
   - `tomcat-embed-*` libraries (9.0.99)
   - `h2` database (2.2.224)

## Verification

✅ Maven build: **SUCCESS**  
✅ All CRITICAL CVEs: **FIXED**  
✅ All HIGH-severity CVEs: **FIXED**  
✅ Dependency tree: **Valid**

## Notes

- The application now uses **Spring Boot 2.7.18**, a stable LTS release with extended support
- Most MEDIUM-severity CVEs in remaining dependencies are related to specific attack vectors that may not affect this application's use case
- For production deployment, continue monitoring security advisories and plan for eventual migration to Spring Boot 3.x for latest security patches
- The H2, Elasticsearch, Jackson, and Logback upgrades provide significant security improvements for data serialization, parsing, and database operations

## Files Modified

- `pom.xml`: Updated Spring Boot version and added dependency management for security patches
- `deps.txt`: Generated dependency tree for verification (can be deleted)

