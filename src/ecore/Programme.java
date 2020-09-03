/**
 */
package ecore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.Programme#getName <em>Name</em>}</li>
 *   <li>{@link ecore.Programme#getCourseInSemester <em>Course In Semester</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ecore.EcorePackage#getProgramme_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecore.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Course In Semester</b></em>' reference list.
	 * The list contents are of type {@link ecore.courseInSemester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course In Semester</em>' reference list.
	 * @see ecore.EcorePackage#getProgramme_CourseInSemester()
	 * @model
	 * @generated
	 */
	EList<courseInSemester> getCourseInSemester();

} // Programme
