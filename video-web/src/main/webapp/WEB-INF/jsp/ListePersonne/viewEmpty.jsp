<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:defineObjects />

<div class="portlet-section-header">Liste des personnes</div>

<div class="portlet-font">
	<table>
		<tr class="portlet-table-header">
			<td>Nom</td>
			<td>Pr�nom</td>
		</tr>
		<tr class="portlet-table-body"
			onmouseover="style.class=portlet-table-selected">
			<td colspan="2">Aucune Personne trouv�e</td>
		</tr>
	</table>
</div>
