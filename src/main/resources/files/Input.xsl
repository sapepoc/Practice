<?xml version = "1.0" encoding = "UTF-8"?>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" indent="yes"/>

	<xsl:template match="/">
		HTML tags Used for formatting purpose. Processor will skip them and
		browser will simply render them.

		<html>
			<body>
				<h2>Students</h2>
				<table border="1">
					<tr bgcolor="#9acd32">
						<th>EmailID</th>
					</tr>

					<xsl:for-each select="TradeData/Trade">
						<tr>
							<td>
								<xsl:value-of select="Trader" />
							</td>							
							<td><xsl:value-of select="SartTime" /></td>
							<td><xsl:value-of select="EndTime" /></td>						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>

	</xsl:template>
</xsl:stylesheet>