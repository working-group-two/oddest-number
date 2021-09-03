# oddest-number
Ineffective odd/even number determinator. Testing gh packages.

## deploying to maven central

```
1. mvn clean
2. jar cvf oddest-number-VERSION-javadoc.jar dummy-javadoc.md
3. mvn deploy
```
`mvn clean deploy -P release`

Note that this requires your maven settings.xml to be configured as described
here: https://central.sonatype.org/publish/publish-maven/

Also you will need your own user with access to the `com.wgtwo` groupid in
sonatype's jira system.
