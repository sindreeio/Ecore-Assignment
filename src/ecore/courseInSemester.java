/**
 */
package ecore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>course In Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.courseInSemester#getCourse <em>Course</em>}</li>
 *   <li>{@link ecore.courseInSemester#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link ecore.courseInSemester#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getcourseInSemester()
 * @model
 * @generated
 */
public interface courseInSemester extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see ecore.EcorePackage#getcourseInSemester_Course()
	 * @model
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link ecore.courseInSemester#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see ecore.EcorePackage#getcourseInSemester_Mandatory()
	 * @model
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link ecore.courseInSemester#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see #setSemester(int)
	 * @see ecore.EcorePackage#getcourseInSemester_Semester()
	 * @model
	 * @generated
	 */
	int getSemester();

	/**
	 * Sets the value of the '{@link ecore.courseInSemester#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(int value);

} // courseInSemester
