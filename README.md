# oddest-number
Ineffective odd/even number determinator. Testing gh packages.

## deploying to maven central

```
mvn deploy
```
`mvn clean deploy -P release`

Note that this requires your maven settings.xml to be configured as described
here: https://central.sonatype.org/publish/publish-maven/

Also you will need your own user with access to the `com.wgtwo` groupid in
sonatype's jira system.
