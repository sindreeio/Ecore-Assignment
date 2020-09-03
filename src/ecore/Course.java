/**
 */
package ecore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.Course#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link ecore.Course#getName <em>Name</em>}</li>
 *   <li>{@link ecore.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link ecore.Course#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Code</em>' attribute.
	 * @see #setCourseCode(String)
	 * @see ecore.EcorePackage#getCourse_CourseCode()
	 * @model
	 * @generated
	 */
	String getCourseCode();

	/**
	 * Sets the value of the '{@link ecore.Course#getCourseCode <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Code</em>' attribute.
	 * @see #getCourseCode()
	 * @generated
	 */
	void setCourseCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ecore.EcorePackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecore.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see ecore.EcorePackage#getCourse_Credits()
	 * @model
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link ecore.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see ecore.EcorePackage#getCourse_Level()
	 * @model
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link ecore.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

} // Course
