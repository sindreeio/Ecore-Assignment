/**
 */
package ecore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester In Studyplan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.SemesterInStudyplan#getStudyplan <em>Studyplan</em>}</li>
 *   <li>{@link ecore.SemesterInStudyplan#getSemester <em>Semester</em>}</li>
 *   <li>{@link ecore.SemesterInStudyplan#getElectives <em>Electives</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getSemesterInStudyplan()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='containAllMandatoryCourses hasAllNeccesaryPoints'"
 * @generated
 */
public interface SemesterInStudyplan extends EObject {
	/**
	 * Returns the value of the '<em><b>Studyplan</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecore.IndividualStudyPlan#getSemestersInStudyplan <em>Semesters In Studyplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studyplan</em>' container reference.
	 * @see #setStudyplan(IndividualStudyPlan)
	 * @see ecore.EcorePackage#getSemesterInStudyplan_Studyplan()
	 * @see ecore.IndividualStudyPlan#getSemestersInStudyplan
	 * @model opposite="semestersInStudyplan" transient="false"
	 * @generated
	 */
	IndividualStudyPlan getStudyplan();

	/**
	 * Sets the value of the '{@link ecore.SemesterInStudyplan#getStudyplan <em>Studyplan</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studyplan</em>' container reference.
	 * @see #getStudyplan()
	 * @generated
	 */
	void setStudyplan(IndividualStudyPlan value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' reference.
	 * @see #setSemester(Semester)
	 * @see ecore.EcorePackage#getSemesterInStudyplan_Semester()
	 * @model
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link ecore.SemesterInStudyplan#getSemester <em>Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Electives</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.Elective}.
	 * It is bidirectional and its opposite is '{@link ecore.Elective#getSemesterInStudyplan <em>Semester In Studyplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electives</em>' containment reference list.
	 * @see ecore.EcorePackage#getSemesterInStudyplan_Electives()
	 * @see ecore.Elective#getSemesterInStudyplan
	 * @model opposite="semesterInStudyplan" containment="true"
	 * @generated
	 */
	EList<Elective> getElectives();

} // SemesterInStudyplan
