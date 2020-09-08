/**
 */
package ecore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.IndividualStudyPlan#getStudentName <em>Student Name</em>}</li>
 *   <li>{@link ecore.IndividualStudyPlan#getSemestersInStudyplan <em>Semesters In Studyplan</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getIndividualStudyPlan()
 * @model
 * @generated
 */
public interface IndividualStudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Student Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student Name</em>' attribute.
	 * @see #setStudentName(String)
	 * @see ecore.EcorePackage#getIndividualStudyPlan_StudentName()
	 * @model
	 * @generated
	 */
	String getStudentName();

	/**
	 * Sets the value of the '{@link ecore.IndividualStudyPlan#getStudentName <em>Student Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student Name</em>' attribute.
	 * @see #getStudentName()
	 * @generated
	 */
	void setStudentName(String value);

	/**
	 * Returns the value of the '<em><b>Semesters In Studyplan</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.SemesterInStudyplan}.
	 * It is bidirectional and its opposite is '{@link ecore.SemesterInStudyplan#getStudyplan <em>Studyplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters In Studyplan</em>' containment reference list.
	 * @see ecore.EcorePackage#getIndividualStudyPlan_SemestersInStudyplan()
	 * @see ecore.SemesterInStudyplan#getStudyplan
	 * @model opposite="studyplan" containment="true"
	 * @generated
	 */
	EList<SemesterInStudyplan> getSemestersInStudyplan();

} // IndividualStudyPlan
