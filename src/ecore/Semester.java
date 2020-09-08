/**
 */
package ecore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.Semester#getSemesterNumber <em>Semester Number</em>}</li>
 *   <li>{@link ecore.Semester#getCourseInSemester <em>Course In Semester</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Number</em>' attribute.
	 * @see #setSemesterNumber(int)
	 * @see ecore.EcorePackage#getSemester_SemesterNumber()
	 * @model id="true"
	 * @generated
	 */
	int getSemesterNumber();

	/**
	 * Sets the value of the '{@link ecore.Semester#getSemesterNumber <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Number</em>' attribute.
	 * @see #getSemesterNumber()
	 * @generated
	 */
	void setSemesterNumber(int value);

	/**
	 * Returns the value of the '<em><b>Course In Semester</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.courseInSemester}.
	 * It is bidirectional and its opposite is '{@link ecore.courseInSemester#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course In Semester</em>' containment reference list.
	 * @see ecore.EcorePackage#getSemester_CourseInSemester()
	 * @see ecore.courseInSemester#getSemester
	 * @model opposite="semester" containment="true"
	 * @generated
	 */
	EList<courseInSemester> getCourseInSemester();

} // Semester
